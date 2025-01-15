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

    //Prueba 6: método Solve - fórmula que contiene múltiples operadores.
    public void test5Solve() {
        String formula = "10+20*3-5";
        String esperado5 = "10+20*3-5=65";
        String resultado5 = Operations.Solve(formula);
        System.out.println("Resultadono esperado");

    }
    // Prueba 7: método Solve con una fórmula que contiene diferentes operadores.
    public void test6Solve() {
        String formula = "10+2-5";
        String esperado6 = "10+2-5=7";
        String resultado = Operations.Solve(formula);
        System.out.println("Resultadono esperado");
    }

// Prueba Solve con una división que resulta en un número no entero.


}
