//package PracticeQuestions;
//import java.util.Scanner;
//
// class RideFareCalc {
//
//    class Ride {
//        double baseFare;
//        double distance;
//
//        Ride(double baseFare, double distance) {
//            this.baseFare = baseFare;
//            this.distance = distance;
//        }
//
//        double calculateFare() {
//            return baseFare * distance;
//        }
//    }
//
//    //  Mini
//    class Mini extends Ride {
//        Mini(double baseFare, double distance) {
//            super(baseFare, distance);
//        }
//
//        @Override
//        double calculateFare() {
//            return super.calculateFare() + 0.05;
//        }
//    }
//
//    // Sedan
//    class Sedan extends Ride {
//        Sedan(double baseFare, double distance) {
//            super(baseFare, distance);
//        }
//
//        @Override
//        double calculateFare() {
//            return super.calculateFare() + 0.5;
//        }
//    }
//
//    //  SUV
//    class SUV extends Ride {
//        SUV(double baseFare, double distance) {
//            super(baseFare, distance);
//        }
//
//        @Override
//        double calculateFare() {
//            return super.calculateFare() * 0.25;
//        }
//    }
//
//    public class ride_fare_calc {
//
//        public static void main(String[] args) {
//
//            Scanner sc = new Scanner(System.in);
//
//            String rideType = sc.next();
//            double baseFare = sc.nextDouble();
//            double distance = sc.nextDouble();
//
//            try {
//                if (baseFare > 10000) {
//                    throw new FareExceededException("Fare Exceeded");
//                }
//                if (distance > 500) {
//                    throw new DistanceExceededException("Distance Exceeded");
//                }
//                Ride r;
//                if (rideType.equalsIgnoreCase("Mini")) {
//                    r = new Mini(baseFare, distance);
//                } else if (rideType.equalsIgnoreCase("Sedan")) {
//                    r = new Sedan(baseFare, distance);
//                } else {
//                    r = new SUV(baseFare, distance);
//                }
//                System.out.println("Final Fare: " + r.calculateFare());
//            } catch (FareExceededException e) {
//                System.out.println(e.getMessage());
//            } catch (DistanceExceededException e) {
//                System.out.println(e.getMessage());
//            }
//            sc.close();
//        }
//    }