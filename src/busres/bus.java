package busres;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bus {
    private String busNumber;
    private int totalSeats;
    private List<Boolean> seatAvailability;

    public Bus(String busNumber, int totalSeats) {
        this.busNumber = busNumber;
        this.totalSeats = totalSeats;
        this.seatAvailability = new ArrayList<>(totalSeats);
        for (int i = 0; i < totalSeats; i++) {
            seatAvailability.add(true);
        }
    }

    public String getBusNumber() {
        return busNumber;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public boolean isSeatAvailable(int seatNumber) {
        return seatAvailability.get(seatNumber - 1);
    }

    public void reserveSeat(int seatNumber) {
        seatAvailability.set(seatNumber - 1, false);
    }

    public void cancelReservation(int seatNumber) {
        seatAvailability.set(seatNumber - 1, true);
    }
}

class ReservationSystem {
    private List<Bus> buses;

    public ReservationSystem() {
        this.buses = new ArrayList<>();
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public void reserveSeat(String busNumber, int seatNumber) {
        for (Bus bus : buses) {
            if (bus.getBusNumber().equals(busNumber)) {
                if (seatNumber >= 1 && seatNumber <= bus.getTotalSeats()) {
                    if (bus.isSeatAvailable(seatNumber)) {
                        bus.reserveSeat(seatNumber);
                        System.out.println("Seat reserved successfully!");
                    } else {
                        System.out.println("Seat is already reserved.");
                    }
                } else {
                    System.out.println("Invalid seat number.");
                }
                return;
            }
        }
        System.out.println("Bus not found.");
    }

    public void cancelReservation(String busNumber, int seatNumber) {
        for (Bus bus : buses) {
            if (bus.getBusNumber().equals(busNumber)) {
                if (seatNumber >= 1 && seatNumber <= bus.getTotalSeats()) {
                    if (!bus.isSeatAvailable(seatNumber)) {
                        bus.cancelReservation(seatNumber);
                        System.out.println("Reservation canceled successfully!");
                    } else {
                        System.out.println("Seat is not reserved.");
                    }
                } else {
                    System.out.println("Invalid seat number.");
                }
                return;
            }
        }
        System.out.println("Bus not found.");
    }
}

public class bus {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        Bus bus1 = new Bus("B001", 10);
        Bus bus2 = new Bus("B002", 15);

        reservationSystem.addBus(bus1);
        reservationSystem.addBus(bus2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Reserve a seat");
            System.out.println("2. Cancel a reservation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the bus number: ");
                String busNumber = scanner.next();
                System.out.print("Enter the seat number: ");
                int seatNumber = scanner.nextInt();
                reservationSystem.reserveSeat(busNumber, seatNumber);
            } else if (choice == 2) {
                System.out.print("Enter the bus number: ");
                String busNumber = scanner.next();
                System.out.print("Enter the seat number: ");
                int seatNumber = scanner.nextInt();
                reservationSystem.cancelReservation(busNumber, seatNumber);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}