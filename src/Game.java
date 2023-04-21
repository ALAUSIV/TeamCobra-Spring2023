public class Game {

    public static void main(String[] args) {

    }

    //Puzzle loop - Albert Austin IV
    public void enterPuzzleLoop() {
        Boolean puzzleLoop;

        if (Controller.getUserInput().toString().equals("get instructions")) {
            puzzleLoop = true;

            View.printPuzzleProblem(Room.getRoomPuzzle().getProblem());

            switch (Room.getRoomPuzzle().getPuzzleReward()) {
                case "chest":

                    for (int i = 0; i = Room.getRoomPuzzle.getAttempts(); i--) {

                        Room.getRoomPuzzle().solve(Controller.getUserInput().toString());

                        if (Room.getRoomPuzzle().solve() == true) {
                            View.printPuzzleSolveAttempt(Room.getRoomPuzzle().getCorrectOutcome());
                            //Legendary armor needs to be added to the player's inventory
                            puzzleLoop = false;
                            break;
                        }
                        else {
                            View.printPuzzleSolveAttempt(Room.getRoomPuzzle().getFailOutcome());
                        }
                    }

                    break;

                case "progress":

                    for (int i = 0; i = Room.getRoomPuzzle.getAttempts(); i--) {

                        Room.getRoomPuzzle().solve(Controller.getUserInput().toString());

                        if (Room.getRoomPuzzle().solve() == true) {
                            View.printPuzzleSolveAttempt(Room.getRoomPuzzle().getCorrectOutcome());
                            //Progress to next room
                            puzzleLoop = false;
                            break;
                        }
                        else {
                            View.printPuzzleSolveAttempt(Room.getRoomPuzzle().getFailOutcome());
                        }
                    }
                    break;

                case "heal":

                    for (int i = 0; i = Room.getRoomPuzzle.getAttempts(); i--) {

                        Room.getRoomPuzzle().solve(Controller.getUserInput().toString());

                        if (Room.getRoomPuzzle().solve() == true) {
                            View.printPuzzleSolveAttempt(Room.getRoomPuzzle().getCorrectOutcome());
                            //Give player potions
                            puzzleLoop = false;
                            break;
                        }
                        else {
                            View.printPuzzleSolveAttempt(Room.getRoomPuzzle().getFailOutcome());
                        }
                    }
            }



        }

        if (Controller.getUserInput().toString().equals("Hint for")) {

            View.printPuzzleHint(Room.getRoomPuzzle().getHint());
        }


    }
    }

