package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        int waterEspresso = 250;
        int beansEspresso = 16;

        int waterLatte = 350;
        int milkLatte = 75;
        int beansLatte = 20;

        int waterCappuccino = 200;
        int milkCappuccino = 100;
        int beansCappuccino = 12;

        boolean check = false;
        while (check == false) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            System.out.println();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String chooseCoffee = scanner.next();
                    switch (chooseCoffee) {
                        case "1":
                            if (waterEspresso > water || beansEspresso > beans || cups < 1) {
                                if (waterEspresso > water && beansEspresso > beans && cups < 1) {
                                    System.out.println("Sorry, not enough water, beans and cups!");
                                } else if (beansEspresso > beans) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (waterEspresso > water) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                            } else {
                                water -= 250;
                                beans -= 16;
                                cups -= 1;
                                money += 4;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            System.out.println();
                            break;
                        case "2":
                            if (waterLatte > water || beansLatte > beans || milkLatte > milk || cups < 1) {
                                if (waterLatte > water && beansLatte > beans && milkLatte > milk && cups < 1) {
                                    System.out.println("Sorry, not enough water, milk, beans and cups!");
                                } else if (beansLatte > beans) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (waterLatte > water) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milkLatte > milk) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                            } else {
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cups -= 1;
                                money += 7;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            System.out.println();
                            break;
                        case "3":
                            if (waterCappuccino > water || beansCappuccino > beans || milkCappuccino > milk || cups < 1) {
                                if (waterCappuccino > water && beansCappuccino > beans && milkCappuccino > milk && cups < 1) {
                                    System.out.println("Sorry, not enough water, milk, beans and cups!");
                                } else if (beansCappuccino > beans) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (waterCappuccino > water) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milkCappuccino > milk) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                } else {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cups -= 1;
                                money += 6;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            System.out.println();
                            break;
                        case "back":
                            System.out.println();
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int fillWater = scanner.nextInt();
                    water += fillWater;
                    System.out.println("Write how many ml of milk do you want to add:");
                    int fillMilk = scanner.nextInt();
                    milk += fillMilk;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int fillBeans = scanner.nextInt();
                    beans += fillBeans;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int fillCups = scanner.nextInt();
                    cups += fillCups;
                    System.out.println();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    System.out.println();
                    break;
                case "remaining":
                    machineHas(water, milk, beans, cups, money);
                    System.out.println();
                    break;
                case "exit":
                    check = true;
                    break;
            }
        }
    }

    public static void machineHas(int water, int milk, int beans, int cups, int money){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }


}

/*
        Stage 1
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        Stage 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int howManyCups = scanner.nextInt();
        System.out.println("For " + howManyCups + " cups of coffee you will need:");
        System.out.println(200 * howManyCups + " ml of water");
        System.out.println(50 * howManyCups + " ml of milk");
        System.out.println(15 * howManyCups + " g of coffee beans");

        Stage 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterInMachine = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkInMachine = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beansInMachine = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int inputCups = scanner.nextInt();

        int needWater = 200 * inputCups;
        int needMilk = 50 * inputCups;
        int needBeans = 15 * inputCups;

        if ((needWater <= waterInMachine) && (needMilk <= milkInMachine) && (needBeans <= beansInMachine)) {
            int remainWaterCups = (waterInMachine - needWater) / 200;
            int remainMilkCups = (milkInMachine - needMilk) / 50;
            int remainBeansCups = (beansInMachine - needBeans) / 15;
            int remainMinCups = Math.min(remainBeansCups, (Math.min(remainWaterCups, remainMilkCups)));
            if (remainMinCups > 0) {
                System.out.println("Yes, I can make that amount of coffee (and even " + remainMinCups + " more than that)");
            } else {
                System.out.println("Yes, I can make that amount of coffee");
            }
        } else {
            int waterCupsInMachine = waterInMachine / 200;
            int milkCupsInMachine = milkInMachine / 50;
            int beansCupsInMachine = beansInMachine / 15;
            int canMakeCups = Math.min(beansCupsInMachine, (Math.min(waterCupsInMachine, milkCupsInMachine)));
            System.out.println("No, I can make only " + canMakeCups + " cup(s) of coffee");
        }
    }
         */