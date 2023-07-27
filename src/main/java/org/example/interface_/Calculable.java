package org.example.interface_;

public interface Calculable {
    double calculateArea();

    // Méthode par défaut pour calculer le périmetre
    default double calculatePerimeter(){
        return 0.0;
    }
}
