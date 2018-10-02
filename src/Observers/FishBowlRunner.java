package Observers;

import java.util.ArrayList;
import java.util.List;

public class FishBowlRunner
{
    public static void main(String[] args)
    {
        List<TropicalFish> fishies = new ArrayList<>();

        fishies.add(new TropicalFish("Henk"));
        fishies.add(new TropicalFish("Yasmine"));
        fishies.add(new TropicalFish("Jowelle"));

        FishFeeder theFishFeeder = new FishFeeder();

        for(TropicalFish fish : fishies)
        {
            theFishFeeder.addObserver(fish);
        }

        System.out.print("We are feeding the fish...");
        theFishFeeder.feedTheFish();

    }
}
