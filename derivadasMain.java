import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

class Derivadas {
    static String opName(ParseTree t) {
        String name = t.getClass().getName();
        name = name.substring(name.indexOf("$") + 1);
        name = name.substring(0, name.indexOf("Context"));
        return name;
    }

    public static String derivada(ParseTree tree) {
        String derivadaStr = "";

        switch (opName(tree)) {
            case "Program":
                derivadaStr += derivada(tree.getChild(0));
                break;
            case "Par":
                derivadaStr += "push (\n";
                derivadaStr += derivada(tree.getChild(1));
                derivadaStr += "push )\n";
                break;
            case "Var":
                derivadaStr += "push 1\n";
                break;
            case "Const":
                derivadaStr += "push 0\n";
                break;
            case "Soma":
                derivadaStr += derivada(tree.getChild(0));
                derivadaStr += "push +\n";
                derivadaStr += derivada(tree.getChild(2));
                derivadaStr += "\n";
                derivadaStr += ("store ");
                derivadaStr += derivada(tree.getChild(0)).charAt(5);
                derivadaStr += " + ";
                derivadaStr += derivada(tree.getChild(2)).charAt(5);
                derivadaStr += "\n";
                break;
            case "Sub":
                 derivadaStr += derivada(tree.getChild(0));
                 derivadaStr += "push -\n";
                 derivadaStr += derivada(tree.getChild(2));
                 derivadaStr += "\n";
                 derivadaStr += ("store ");
                 derivadaStr += derivada(tree.getChild(0)).charAt(5);
                 derivadaStr += " - ";
                 derivadaStr += derivada(tree.getChild(2)).charAt(5);
                 derivadaStr += "\n";
                break;
        case "Mult":
            if (opName(tree.getChild(0)).equals("Var") && opName(tree.getChild(2)).equals("Const")) {
                derivadaStr += tree.getChild(2).getText() + "\n";
            } else if (opName(tree.getChild(2)).equals("Var") && opName(tree.getChild(0)).equals("Const")) {
                derivadaStr += tree.getChild(0).getText() + "\n";
            } else {
                derivadaStr += derivada(tree.getChild(0));
                derivadaStr += "push *\n";
                derivadaStr += derivada(tree.getChild(2));
                derivadaStr += "\n";
                derivadaStr += "store ";
                derivadaStr += derivada(tree.getChild(0)).charAt(5);
                derivadaStr += " * ";
                derivadaStr += derivada(tree.getChild(2)).charAt(5);
                derivadaStr += "\n";
            }
            break;
           case "Div":
            derivadaStr += "push (\n";
            derivadaStr += derivada(tree.getChild(0));
            derivadaStr += "push *\n";
            derivadaStr += tree.getChild(2).getText() + "\n";
            derivadaStr += "push -\n";
            derivadaStr += tree.getChild(0).getText() + "\n";
            derivadaStr += "push *\n";
            derivadaStr += derivada(tree.getChild(2));
            derivadaStr += "push )\n";
            derivadaStr += "push /\n";
            derivadaStr += "push(\n";
            derivadaStr += tree.getChild(2).getText() + "\n";
            derivadaStr += ")\n";
            derivadaStr += "^\n";
            derivadaStr += "2\n";
            derivadaStr += "\n";
            derivadaStr += "store ";
            derivadaStr += derivada(tree.getChild(0)).charAt(5);
            derivadaStr += " / ";
            derivadaStr += derivada(tree.getChild(2)).charAt(5);
            derivadaStr += "\n";
            break;
           case "Pot":
                if (Integer.parseInt(tree.getChild(2).getText()) != 1) {
                    derivadaStr += "push " + Integer.toString(Integer.parseInt(tree.getChild(2).getText())) + "\n";
                    derivadaStr += "push *\n";
                    derivadaStr += "push " + tree.getChild(0).getText() + "\n";
                    derivadaStr += "push ^\n";
                    derivadaStr += "push " + Integer.toString(Integer.parseInt(tree.getChild(2).getText()) - 1);
                    derivadaStr += "\n";
                    derivadaStr += "store ";
                    derivadaStr += tree.getChild(0).getText() + " ^ " + tree.getChild(2).getText();
                    derivadaStr += "\n";
                } else if (Integer.parseInt(tree.getChild(2).getText()) == 1) {
                    derivadaStr += derivada(tree.getChild(0));
                }
                break;
        }

        return derivadaStr;
    }

    public static void main(String args[]) throws Exception {
        CharStream stream = CharStreams.fromFileName("exemplo.derivada");
        gramaticaLexer lexer = new gramaticaLexer(stream);
        TokenStream tkStream = new CommonTokenStream(lexer);
        gramaticaParser parser = new gramaticaParser(tkStream);
        ParseTree tree = parser.program();

        if (tree != null) {
            System.out.println("Derivada da árvore de análise sintática:");
            String derivadaResult = derivada(tree);
            System.out.println(derivadaResult);
        } else {
            System.out.println("Erro ao obter a árvore de análise sintática.");
        }
    }
}
