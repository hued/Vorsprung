package hackaton.bayern.vor5prung.Model;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

import hackaton.bayern.vor5prung.R;

/**
 * Created by edhuar on 20.01.18.
 */

public class Utils {

    public static ArrayList<Enemy> getUpcomingGames(){
        ArrayList<Enemy> upcomingGames = new ArrayList<>();
        upcomingGames.add(new Enemy("Werder Bremen", R.drawable.bremen));
        upcomingGames.add(new Enemy("Hoffenheim", R.drawable.hoffenheim));
        upcomingGames.add(new Enemy("Friburgo", R.drawable.friburgo));
        upcomingGames.add(new Enemy("RB Leipzig", R.drawable.leipzig));
        upcomingGames.add(new Enemy("Hamburg", R.drawable.hamburg));
        upcomingGames.add(new Enemy("Borussia Dormunt", R.drawable.bremen));
        upcomingGames.add(new Enemy("Frankfurt", R.drawable.frankfurt));
        upcomingGames.add(new Enemy("Hannover", R.drawable.hannover));

        return upcomingGames;
    }

    public static ArrayList<FCBayernMunichFan> getBayernMunichFans(){
        ArrayList<FCBayernMunichFan> fans = new ArrayList<>();
        fans.add(new FCBayernMunichFan("Edgar Huaranga","+49123786141324", new LatLng(48.2267985,11.6771379), "https://scontent-frt3-2.xx.fbcdn.net/v/t1.0-9/15941485_1348098251878072_5058844172150348009_n.jpg?oh=b1f8d4743838da7893fa78a3e18ebf14&oe=5AEBD653"));
        fans.add(new FCBayernMunichFan("Julia Mueller","+49177221324", new LatLng(48.1402025,11.6062979), "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo6sF8sED3fykRX23q8JTdNHKfNRNi3R-lRqM-ZEuaxe3IsV7l"));
        fans.add(new FCBayernMunichFan("Mark Forster","+49172991324", new LatLng(48.136838,11.5993715), "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo6sF8sED3fykRX23q8JTdNHKfNRNi3R-lRqM-ZEuaxe3IsV7l"));
        fans.add(new FCBayernMunichFan("Florian Mayer","+49152167324", new LatLng(48.1440385,11.572543), "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo6sF8sED3fykRX23q8JTdNHKfNRNi3R-lRqM-ZEuaxe3IsV7l"));
        fans.add(new FCBayernMunichFan("Madalin Cosma","+49157229151", new LatLng(48.1382694,11.4975091), "https://scontent-frt3-2.xx.fbcdn.net/v/t1.0-9/23032747_2034148616869457_7596279972638368409_n.jpg?oh=3704e5c5498d47c61928faf3d690b01c&oe=5ADA793F"));
        fans.add(new FCBayernMunichFan("Markus Kling","+4915923546", new LatLng(48.1455672,11.5075303), "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo6sF8sED3fykRX23q8JTdNHKfNRNi3R-lRqM-ZEuaxe3IsV7l"));
        fans.add(new FCBayernMunichFan("Thomas Zeismann","+49155566789", new LatLng(48.1421669,11.540407), "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo6sF8sED3fykRX23q8JTdNHKfNRNi3R-lRqM-ZEuaxe3IsV7l"));
        return fans;
    }
}
