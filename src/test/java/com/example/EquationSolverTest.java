package com.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class EquationSolverTest {

    // @Test
    // public void testResoudreEquationLineaire() {
    //     // Instanciez votre classe à tester
    //     EquationSolver solver = new EquationSolver();

    //     // Appelez la méthode à tester
    //     double[] solutions = solver.solveQuadratic(0, 4, 2);
    //     saveResultsToCSV("resultats_equations.csv", 2.0, 4.0, 2.0, solutions);
    //     // Vérifiez le résultat avec les assertions JUnit
    //     assertArrayEquals(new double []{-1.0}, solutions, 0.001); // Utilisez une marge d'erreur pour les comparaisons avec des nombres à virgule flottante
    // }

    public static void saveResultsToCSV(String filePath, double a, double b, double c, double[] solutions) {
        // Résoudre l'équation
        EquationSolver solver = new EquationSolver();

        // Appelez la méthode à tester
        // double[] solutions = solver.solveQuadratic(0, 4, 2);
        // double[] solutions = solveQuadratic(a, b, c);

        CSVPrinter csvPrinter = null;
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("test_results.csv", true);
               CSVFormat csvFormat = CSVFormat.DEFAULT;
               csvPrinter = new CSVPrinter(fileWriter, csvFormat);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

           
        // Écrire les résultats dans un fichier CSV
        try (FileWriter writer = new FileWriter(filePath, true)) {
            // En-tête du fichier CSV
            writer.append("Equation,a,b,c,ResultatX0,ResultatX1\n");

            // Ligne pour chaque solution
            for (int i = 0; i < solutions.length; i++) {
                writer.append("Equation " + (i + 1) + "," + a + "," + b + "," + c + "," + solutions[i] + "\n");
            }

            // System.out.println("Résultats enregistrés dans le fichier CSV : " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // @Test
    // public void testSolve() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    //     // // Créez un mock de l'interface IEquationSolver
    //     // IEquationSolver iEquationSolver = mock(IEquationSolver.class);
    //     // EquationSolver iEquationSolver = new EquationSolver();
    //     Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
    //     Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
    //     double result = (double) dynamicClass.getMethod("solve", double.class, double.class).invoke(dynamicObject, 5, 2);

    //     // // Définissez le comportement simulé du mock
    //     // when(iEquationSolver.solve(anyDouble(), anyDouble())).thenReturn(1.0);

    //     // Utilisez le mock dans le test
    //     assertEquals(0, 5*result + 2, 0.001); // Utilisez une marge d'erreur pour les comparaisons avec des nombres à virgule flottante
    // }
    // @Test
    // public void testSolve2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    //     // // Créez un mock de l'interface IEquationSolver
    //     // IEquationSolver iEquationSolver = mock(IEquationSolver.class);
    //     // EquationSolver iEquationSolver = new EquationSolver();
    //     Class<?> dynamicClass = Class.forName("com.example.EquationSolver");
    //     Object dynamicObject = dynamicClass.getDeclaredConstructor().newInstance();
    //     double[] result = (double[]) dynamicClass.getMethod("solveQuadratic", double.class, double.class, double.class).invoke(dynamicObject, 5, 2, 2);

    //     // // Définissez le comportement simulé du mock
    //     // when(iEquationSolver.solve(anyDouble(), anyDouble())).thenReturn(1.0);

    //     // Utilisez le mock dans le test
    //     assertArrayEquals(new double []{-1.0}, result, 0.001); // Utilisez une marge d'erreur pour les comparaisons avec des nombres à virgule flottante
    // }

    // fonction capable de generer un fichier txt
    // lie le fichier jenny et generer les fichier de test
    
}
