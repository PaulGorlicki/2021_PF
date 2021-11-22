package td3.ex2;

import td2.universite.Annee;
import td2.universite.Etudiant;
import td2.universite.Matiere;
import java.util.function.Function;
import java.util.stream.Stream;
import static td2.App.aDEF;

public class Refactor {

    public static final Function<Annee, Stream<Matiere>> matieresA = null;

   /* public static final Function<Etudiant, Double> moyenne = e -> (e == null || aDEF
            .test(e)) ? null : computeMoyenne.apply(e);

    public static final Function<Etudiant, Double> moyenneIndicative =
            computeMoyenneIndicative;*/

}
