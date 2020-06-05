package es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.util;

import java.util.ArrayList;

import es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.R;
import es.iesnervion.nyeghiazaryan.practicandoroomconvmyfragments.clases.Nba;

public class Utilidades
{
    public ArrayList<Nba> cargarArrayNba()
    {
        ArrayList<Nba> lista=new ArrayList<>();

//        for(int i=0;i<1000;i++)//para probar
//        {
            lista.add(new Nba("Atlanta Hawks", R.drawable.atlanta_hawks,"El equipo fue fundado en 1946 como Tri-Cities Blackhawks en la zona del río Misisipi. Tras trasladarse a Milwaukee, Wisconsin, en 1951, la franquicia fue renombrada como Milwaukee Hawks. Antes de la temporada 1955-56, los Hawks se mudaron a St. Louis, Missouri, pasando en la ciudad trece temporadas y ganando el campeonato de 1958, el único en la historia de la franquicia. Finalmente, en 1968 se movieron a Atlanta, Georgia"));
            lista.add(new Nba("Boston Celtics", R.drawable.boston_celtics,"Fundado en 1946, con sus 17 campeonatos es el equipo más laureado de la historia de la NBA.1\u200B El equipo dominó la NBA desde 1957 hasta 1969 con once anillos de campeón, ocho de ellos consecutivos, récord de la liga. En la década de 1970 ganaron dos títulos más y en los años 80, con Larry Bird a la cabeza, conseguirían otros tres títulos, disputando además tres épicas finales contra sus clásicos rivales, Los Angeles Lakers."));
            lista.add(new Nba("Brooklin Nets", R.drawable.brooklyn_nets,"El equipo fue fundado en 1967 con el nombre de New Jersey Americans y comenzó jugando en la ABA. En 1968 la franquicia cambió el nombre a New York Nets. Con este nombre ingresó en la NBA en 1976, nueve años después de su fundación."));
            lista.add(new Nba("Charlotte Hornetts", R.drawable.charlottehornetts,"Los Hornets originales fueron fundados en 1988 no como un equipo de expansión, propiedad del empresario George Shinn. En 2002, Shinn trasladó el equipo a Nueva Orleans, que se convirtió en los New Orleans Hornets."));
            lista.add(new Nba("Chicago Bulls", R.drawable.chicago_bulls,"Chicago Bulls (en idioma español: Toros de Chicago) es un equipo de baloncesto profesional de la NBA con sede en Chicago, Illinois, fundado en 1966. Es el tercer equipo profesional con sede en esta ciudad tras Chicago Packers/Zephyrs y Chicago Stags, equipo que participó en los años 1940 en la BAA, antigua denominación de la liga profesional norteamericana de baloncesto."));
            lista.add(new Nba("Cleveland Cavaliers", R.drawable.cleveland_cavaliers,"Cleveland Cavaliers (también conocidos como Cavs) (en idioma español: Caballeros de Cleveland) es un equipo profesional de baloncesto de la NBA con sede en Cleveland, Ohio. Disputan sus partidos como local desde 1994 en el Quicken Loans Arena, un estadio con capacidad para 20.562 espectadores. Ganaron su primer título de la NBA en la temporada 2015-16."));
            lista.add(new Nba("Detroit Pistones", R.drawable.detroit_pistons,"Los Detroit Pistons (en español, Pistones de Detroit) son un equipo profesional de baloncesto de los Estados Unidos con sede en Detroit, Míchigan. Compiten en la División Central de la Conferencia Este de la National Basketball Association (NBA) y disputan sus partidos como locales en el Little Caesars Arena, ubicado en el centro de la ciudad de Detroit."));
            lista.add(new Nba("Indiana Pacers", R.drawable.indiana_pacers,"Indiana Pacers es un equipo de baloncesto profesional de la NBA con sede en Indianápolis, Indiana. Su mayor logro fue haber llegado a las Finales de la NBA en el año 2000, donde perdieron ante Los Angeles Lakers, por 4-2."));
            lista.add(new Nba("Miami Heat", R.drawable.miami_heat,"El equipo fue fundado en 1988 gracias a la expansión de la NBA en 1987. Cuenta con tres títulos de la NBA, obtenidos en la temporada 2005-06 al vencer a los Dallas Mavericks 4-2, en la 2011-12 derrotando a Oklahoma City Thunder 4-1 en la serie, además del más reciente obtenido en la 2012-13 derrotando en el máximo de 7 partidos a los San Antonio Spurs. Además de los tres anillos, el Heat ha obtenido 11 títulos de división, logrados en las tres épocas más gloriosas de la franquicia: 1997-2000, 2005-2007 y 2011-2014."));
            lista.add(new Nba("Milwaukee Bucks", R.drawable.milwaukee_bucks,"Milwaukee Bucks (en idioma español: Ciervos de Milwaukee) es un equipo de baloncesto de la NBA con base en Milwaukee, Wisconsin. Disputa sus partidos como local en el Fiserv Forum desde la temporada 1988-89. Ganó el campeonato de la NBA en 1971 contando en sus filas con dos de los más grandes jugadores de la historia de la NBA, Oscar Robertson y Lew Alcindor (posteriormente conocido como Kareem Abdul-Jabbar).\n" +
                    "\n"));
            lista.add(new Nba("New York Knicks", R.drawable.new_york_knicks,"Los New York Knickerbockers, más conocidos popularmente como New York Knicks («Knicks de Nueva York») son una franquicia de baloncesto de la NBA con sede en la ciudad de Nueva York. Son actualmente la franquicia más valiosa de la liga, con un valor de 4600 millones de dólares."));
            lista.add(new Nba("Orlando Magic", R.drawable.orlando_magic,"Orlando Magic (en español: La Magia de Orlando) es una franquicia de la NBA con sede en Orlando, Florida. Comenzó a disputar la liga tras la expansión de la misma de 1989."));
            lista.add(new Nba("Philadelphia 78ers", R.drawable.philadelphia_78ers,"Fundado en 1939, aunque entró en la NBA diez años después, juegan en la División Atlántico de la Conferencia Este y disputan sus partidos de casa en el Wells Fargo Center."));
            lista.add(new Nba("Toronto Raptors", R.drawable.toronto_raptors,"Los Toronto Raptors son un equipo de baloncesto de la NBA con sede en Toronto, Canadá. Llegaron a la liga tras la expansión que se realizó en 1995, junto con los Vancouver Grizzlies."));
            lista.add(new Nba("washington Wizards", R.drawable.washington_wizards,"Los Wizards fueron conocidos hasta 1997 como Bullets (balas en español), pero cambiaron su nombre para evitar asociaciones con la criminalidad que dañasen la imagen de la ciudad de Washington."));
//        }
        return lista;
    }
}
