package be.vinci.cae.fiche1.service;


import be.vinci.cae.fiche1.models.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    String[][] restaurants = {
            {"Comme Chez Soi", "Française"},
            {"Le Chalet de la Forêt", "Belge"},
            {"La Villa Lorraine", "Française"},
            {"Belga Queen", "Belge"},
            {"Bia Mara", "Fish"},
            {"Aux Armes de Bruxelles", "Belge"},
            {"Noordzee Mer du Nord", "Poisson"},
            {"Fin de Siècle", "Européenne"},
            {"Bon Bon", "Française"},
            {"La Quincaillerie", "Belge"},
            {"Café Georgette", "Belge"},
            {"Amadeus", "Ribs"},
            {"Le Pain Quotidien", "Bio"},
            {"The Sister Brussels Café", "Végétarienne"},
            {"Certo", "Italienne"},
            {"Brugmann", "Française"},
            {"Chez Léon", "Belge"},
            {"Yi Chan", "Asiatique"},
            {"Kamo", "Japonaise"},
            {"Humus x Hortense", "Végétarienne"}
    };

    public List<Restaurant> getAllRestaurant() {
        List<Restaurant> restaurantsL = new ArrayList<>();
        for(String[] restaurant: restaurants) {
            restaurantsL.add(new Restaurant(restaurant[0], restaurant[1]));
        }

        return restaurantsL;
    }

    public List<Restaurant> getRestaurant(String type) {
        List<Restaurant> restaurantsL = new ArrayList<>();
        for(String[] restaurant: restaurants) {
            if (restaurant[1].equals(type)){
                restaurantsL.add(new Restaurant(restaurant[0], restaurant[1]));
            }
        }

        return restaurantsL;
    }
}
