package edu.kit.informatik;

import de.hamstersimulator.objectsfirst.external.model.Hamster;
import de.hamstersimulator.objectsfirst.inspector.InspectableSimpleHamsterGame;

/**
 * A simple HamsterGame where paule can walk a path of grains
 */
public class FirstHamsterGame extends InspectableSimpleHamsterGame {

    /**
     * This is an instance of the paule from the class Hamster
     */
    protected final Hamster paule;

    public FirstHamsterGame(Hamster paule) {
        this.paule = paule;
    }

    /**
     * Creates a new FirstHamsterGame
     */
    public FirstHamsterGame() {
        this.loadTerritoryFromResourceFile("/territories/territory.ter");
        this.displayInNewGameWindow();
        this.game.startGame();
        this.paule = this.game.getTerritory().getDefaultHamster();
    }

    /*
     * The main method indicates the compiler the entry point to the program.
     * First, a new instance (game) of the class FirstHamsterGame is created.
     * Then, with the operation game.run() the method run() of the class FirstHamsterGame is executed.
     */
    public static void main(String[] args) {
        final FirstHamsterGame game = new FirstHamsterGame();
        game.doRun();
    }

    /**
     * Executed after the game is started.
     * Can be used to execute hamster commands.
     */
    
    @Override
    public void run() {
        paule.pickGrain();

     
        int i = 0;
        while (paule.frontIsClear()) {
            paule.move();
            i++;
            if (i == 5) {
            	paule.turnLeft();
            }
            if (i == 7) {
            	paule.turnLeft();
            }
            if (i == 12) {
            	paule.turnLeft();
            	paule.turnLeft();
            	paule.turnLeft();
            }
            if (i == 14) {
            	paule.turnLeft();
            	paule.turnLeft();
            	paule.turnLeft();
            }
            if (i == 15) {
            	paule.turnLeft();
            	paule.turnLeft();
            	paule.turnLeft();
            }
            if (i == 16) {
            	paule.turnLeft();
            }
            if (i == 18) {
            	paule.turnLeft();
            }
            
            if (i == 20) {
            	paule.turnLeft();
            	paule.turnLeft();
            	paule.turnLeft();
            }
           
            
            if (i == 22) {
            	while(!paule.mouthEmpty()) {
            		paule.putGrain();
            	}
            }
            
            while (paule.grainAvailable()) {
            	if (i != 22) {
            		paule.pickGrain();
            	}
            }
        }
       

      
    	
        // Exercise: use commands like move() or pickGrain() to collect all grains
    
    }

    /*
     * Exercise for students with prior knowledge in programming:
     * Implement the method turnRight, that lets Paule turn right.
     */
    private void turnRight() {
    	//paule.turnLeft();
    	//paule.turnLeft();
    	//paule.turnLeft();
    }
}
