class Main {
    public static void main(String[] args) {
        Action[] members = { new Human("Никита", 2.0D, 100),
                new Cat("Артём", 3.0D, 150),
                new Robot("Олег", 1.0D, 200) };
                        Barrier[] obstacles = { Wall.LOW,
                Wall.MIDDLE,
                Racetrack.MIDDLE,
                Racetrack.HIGH };
        byte b;
        int i;
        Action[] arrayOfAction1;
        for (i = (arrayOfAction1 = members).length, b = 0; b < i; ) {
            Action member = arrayOfAction1[b];
            byte b1;
            int j;
            Barrier[] arrayOfBarrier;
            for (j = (arrayOfBarrier = obstacles).length, b1 = 0; b1 < j; ) {
                Barrier obstacle = arrayOfBarrier[b1];
                if (!obstacle.getReady(obstacle, member))
                    break;
                b1++;
            }
            b++;
        }
  }
    }
