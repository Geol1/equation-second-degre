package com.example;

public class EquationSolver implements IEquationSolver {

    @Override
    public double[] solveQuadratic(double a, double b, double c) {
        // Calcul du discriminant
        double discriminant = b * b - 4 * a * c;

        // Initialisation du tableau de solutions
        double[] solutions;

        // Cas où le discriminant est positif
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            solutions = new double[]{root1, root2};
        }
        // Cas où le discriminant est nul
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            solutions = new double[]{root};
        }
        // Cas où le discriminant est négatif (pas de solution réelle)
        else {
            solutions = new double[0];
        }

        return solutions;
    }

    // Autres méthodes ou fonctionnalités peuvent être ajoutées ici
}
