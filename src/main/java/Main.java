class Main {
    public static void main(String[] args) {
        Action[] members = {
                new Human("Никита", 2.0D, 100),
                new Cat("Артём", 3.0D, 150),
                new Robot("Олег", 1.0D, 200) };
        Barrier[] obstacles = {
                Wall.MIDDLE,
                Wall.MIDDLE,
                Racetrack.MIDDLE,
                Racetrack.HIGH };
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j<obstacles.length; j++ ) {
                if (!obstacles[j].getReady(obstacles[j], members[i]))
                    break;
            }
        }
  }
    }
