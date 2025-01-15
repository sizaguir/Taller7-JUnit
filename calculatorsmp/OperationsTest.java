package calculatorsmp;

public class OperationsTest {

    // Prueba 1: Verificacion del metodo MakeFormula() y el que genere una formula
    // valida
    public void testMakeFormula() {
        String formula = Operations.MakeFormula();
        System.out.println("Fórmula Generada: " + formula);

    }

    // Prueba2 :método Solve con una operación de suma simple.
    public void test1Solve() {
        String formula = "10+20";
        String esperado1 = "10+20=30";
        String resultado1 = Operations.Solve(formula);
        System.out.println("Resultadono esperado");
    }

    // Prueba 3: método Solve con una operación de resta simple.
    public void tes2tSolve() {
        String formula = "50-15";
        String esperado2 = "50-15=35";
        String resultado2 = Operations.Solve(formula);
        System.out.println("Resultadono esperado");
    }

    // Prueba 4:método Solve con una operación de multiplicación simple.

    public void test3Solve(){
        String formula = "7*8";
        String esperado3 = "7*8=56";
        String resultado3 = Operations.Solve(formula);
        System.out.println("Resultadono esperado");
    }

    // Prueba5:método Solve con una operación de división simple.
    public void test4Solve() {
        String formula = "100/25";
        String esperado4 = "100/25=4";
        String resultado4 = Operations.Solve(formula);
        System.out.println("Resultadono esperado");
    }
}
