import java.util.Scanner;
 

public class TicketApp{
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        double basePrice =100.0;
System.out.print("kac bilet almak istiyorsunuz ? (1-2) :");
 int numTickets;
  try { 
       numTickets = Integer.parseInt(scanner.nextLine());
       if (numTickets < 1|| numTickets >2){
        numTickets =1;
       }
    } catch (Exception e){
        numTickets =1;
    }
     for (int i= 1 ; i <= numTickets ; i++){
        System.out.println("\n--"+i+". Bilet--");
        System.out.println("Koltuk tipi (0:STANDARD ,1: PREMIUM,2: VIP):");
        int seatChoice = Integer.parseInt(scanner.nextLine());
        SeatType selectedSeat = SeatType.values()[seatChoice];


        System.out.println("Seans(0: DAY,1: EVENING,2: LATE):");
        int timeChoice = Integer.parseInt(scanner.nextLine());
        Showtime selectedShowtime = Showtime.values()[timeChoice];

       CinemaTicket ticket = new CinemaTicket(selectedSeat, selectedShowtime, basePrice);
        System.out.println(ticket.getDescription());
     }
     System.out.println("\nToplam satilan bilet sayisi :" + CinemaTicket.getTicketCounter());
     scanner.close();
    }
}