class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int currentPositionX = robot.getX();
        int currentPositionY = robot.getY();
        Direction currentDirection = robot.getDirection();
        if (currentPositionX > toX && currentDirection == Direction.UP) {
            robot.turnLeft();
            while (robot.getX() != toX) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionX < toX && currentDirection == Direction.UP) {
            robot.turnRight();
            while (robot.getX() != toX) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionX == toX) {
            //System.out.println(robot.getX() + " " + robot.getY());
        } else if (currentPositionX > toX && currentDirection == Direction.RIGHT) {
            robot.turnRight();
            robot.turnRight();
            while (robot.getX() != toX) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionX < toX && currentDirection == Direction.RIGHT) {
            while (robot.getX() != toX) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionX == toX) {
            //System.out.println(robot.getX() + " " + robot.getY());
        } else if (currentPositionX > toX && currentDirection == Direction.DOWN) {
            robot.turnRight();
            while (robot.getX() != toX) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionX < toX && currentDirection == Direction.DOWN) {
            robot.turnLeft();
            while (robot.getX() != toX) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else  if (currentPositionX == toX) {
            // System.out.println(robot.getX() + " " + robot.getY());
        } else if (currentPositionX > toX && currentDirection == Direction.LEFT) {
            while (robot.getX() != toX) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionX < toX && currentDirection == Direction.LEFT) {
            robot.turnRight();
            robot.turnRight();
            while (robot.getX() != toX) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionX == toX) {
            //System.out.println(robot.getX() + " " + robot.getY());
        }

        currentDirection = robot.getDirection();

        if (currentPositionY > toY && currentDirection == Direction.UP) {
            robot.turnRight();
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionY < toY && currentDirection == Direction.UP) {
            while (robot.getY() != toY) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionY == toY) {
            //System.out.println(robot.getX() + " " + robot.getY());
        } else if (currentPositionY > toY && currentDirection == Direction.RIGHT) {
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionY < toY && currentDirection == Direction.RIGHT) {
            robot.turnLeft();
            while (robot.getY() != toY) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionY == toY) {
            //System.out.println(robot.getX() + " " + robot.getY());
        } else if (currentPositionY > toY && currentDirection == Direction.DOWN) {
            while (robot.getY() != toY) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionY < toY && currentDirection == Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionY == toY) {
            //System.out.println(robot.getX() + " " + robot.getY());
        } else if (currentPositionY > toY && currentDirection == Direction.LEFT) {
            robot.turnLeft();
            while (robot.getY() != toY) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionY < toY && currentDirection == Direction.LEFT) {
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
                //System.out.println(robot.getX() + " " + robot.getY());
            }
        } else if (currentPositionY == toY) {
            //System.out.println(robot.getX() + " " + robot.getY());
        }

    }
    /*
    public static void main(String[] args) {
        Robot robot = new Robot(-10, -10, Direction.UP);
        moveRobot(robot, 10, -10);
    }
    */
}
//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}