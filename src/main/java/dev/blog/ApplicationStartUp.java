package dev.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dev.entitie.Collegue;
import dev.repository.CollegueRepository;

@Component
public class ApplicationStartUp implements CommandLineRunner {
	
	@Autowired
	CollegueRepository collegueRepository ;
	
	@Override
    public void run(String... strings) throws Exception {
		
		long nb = collegueRepository.count();
		
		if(nb == 0) {

			Collegue collegue1 = new Collegue( "Melodie",
	                "https://www.seduction-efficace.com/wp-content/uploads/2015/04/signaux-dinteret-filles.jpg",
	                12);
	        
	        
	        Collegue collegue2 = new Collegue("Alexandre",
	                "https://slab.adopteunmec.com/uploads/survey/top100_2017/athletes_antoine_griezmann_470x416.jpg",
	                26);
	        
	        Collegue collegue3 = new Collegue("Sandra",
	                "http://media.gamaniak.com/gal/jolies-filles-3/gamaniak_jolies-filles-3_01.jpg",
	                30);
	        
	        Collegue collegue4 = new Collegue("Mouhamed",
	                "https://boutique.univ-rouen.fr/wp-content/uploads/2016/05/xboutique-univ-rouen-normandie-polo-homme-gris3-300x300.jpg.pagespeed.ic.z_aKHB_Xbh.jpg",
	                25
	              );
	        
	        Collegue collegue5 = new Collegue("Yves",
	                "https://t4.ftcdn.net/jpg/00/78/73/53/240_F_78735333_o3qJe4bT5ciwldLIjVDulFKrDAV3jGYO.jpg",
	                22);
	        
	        Collegue collegue6 = new Collegue("Clement",
	                "https://image.afcdn.com/dossiers/D20100514/pattinson-162806_L.jpg",
	                20) ;
	        
	        Collegue collegue7 = new Collegue("Thien Ban",
	        "https://thumbs.dreamstime.com/b/homme-vietnamien-de-sourire-52875652.jpg",
	        20
	      );
	        
	       Collegue collegue8 = new Collegue( "Rossi","https://media-exp2.licdn.com/mpr/mpr/shrinknp_200_200/AAEAAQAAAAAAAAdQAAAAJDk1MWNmZDAwLTNiMTgtNDU0NC05NzM5LWY3MjRhMjBmOGM0Yg.jpg",20);
	        
	        collegueRepository.save(collegue1) ;
	        collegueRepository.save(collegue2) ;
	        collegueRepository.save(collegue3) ;
	        collegueRepository.save(collegue4) ;
	        collegueRepository.save(collegue5) ;
	        collegueRepository.save(collegue6) ;
	        collegueRepository.save(collegue7) ;
	        collegueRepository.save(collegue8) ;
		}


}

}
