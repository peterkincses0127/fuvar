import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Feladatok {
    private ArrayList<Fuvar> fuvarList = new ArrayList<>();
    public Feladatok() throws IOException {
        FileReader fr = new FileReader("fuvar.csv");
        BufferedReader br = new BufferedReader(fr);
        String sor = br.readLine();
        while((sor=br.readLine()) != null){
            String [] adatok = sor.split(";");
            int id = Integer.parseInt(adatok[0]);
            String indulas = adatok[1];
            int idotartam = Integer.parseInt(adatok[2]);
            double tavolsag = Double.parseDouble(adatok[3].replace(',','.'));
            double viteldij = Double.parseDouble(adatok[4].replace(',','.'));
            double borravalo = Double.parseDouble(adatok[5].replace(',','.'));
            String fizetesMod = adatok[6];
            Fuvar f = new Fuvar(id,indulas,idotartam,tavolsag,viteldij,borravalo,fizetesMod);
            fuvarList.add(f);

        }

        br.close();
        fr.close();
        feladatok3();
        feladat4(6185);
        feladat5();
    }
        public void feladatok3(){
            long feladat3;
            feladat3 = fuvarList.stream()
                    .count();
            System.out.println(feladat3);
        }
        public void feladat4(int fuvarID){
            long fuvarszam = fuvarList.stream()
                    .filter(fuvar -> fuvar.getId() == fuvarID)
                    .count();
            double bevetel = fuvarList.stream()
                    .filter(fuvar-> fuvar.getId() == fuvarID)
                    .mapToDouble(f ->  f.getViteldij() + f.getBorravalo())
                    .sum();
            System.out.println("4. Feladat:" +fuvarszam+ "\n\tfuvar alatt: "+ bevetel +"$");

        }
        public void feladat5(){
            long countbankkartya = fuvarList.stream()
                    .filter(bankkartya -> bankkartya.getFizetesMod().equals("bankkártya"))
                    .count();
            long countkezpenz = fuvarList.stream()
                    .filter(kezpenz -> kezpenz.getFizetesMod() .equals("készpénz"))
                    .count();
            long countvitatott = fuvarList.stream()
                    .filter(vitatott -> vitatott.getFizetesMod() .equals("vitatott"))
                    .count();
            long countingyenes = fuvarList.stream()
                    .filter(ingyenes -> ingyenes.getFizetesMod() .equals("ingyenes") )
                    .count();
            long countismeretlen = fuvarList.stream()
                    .filter(ismeretlen -> ismeretlen.getFizetesMod() .equals("ismeretlen") )
                    .count();
            System.out.println("5. Feladat\n\tbankkártyás: "+ countbankkartya +" fuvar");
            System.out.println("\tkészpénzes "+countkezpenz+ " fuvar");
            System.out.println("\tvitatott "+countvitatott+ " fuvar");
            System.out.println("\tingyenes "+countingyenes+ " fuvar");
            System.out.println("\tismeretlen "+countismeretlen+ " fuvar");


        }
    }



