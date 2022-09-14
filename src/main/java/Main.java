class Main {
    public static void main(String[] args) {
        Action[] members = new Action[]{
                new Human("������", 2, 100),
                new Cat("�����", 3, 150),
                new Robot("����", 1, 200)
        };

        Barrier[] obstacles = new Barrier[]{
                Wall.LOW,
                Wall.MIDDLE,
                Racetrack.MIDDLE,
                Racetrack.HIGH
        };

        for (Action member : members) {
            for (Barrier obstacle : obstacles) {
                if (!obstacle.getReady(obstacle.getDistance(), member)){

                    break;
                }
            }
        }
    }
}
