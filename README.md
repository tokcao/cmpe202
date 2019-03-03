# cmpe202

Explanation to communication diagram.
  The design pattern I chose was Chain of Responsibility Design Pattern. In my design, the role of Customer is Client. Reservation System works as the Handler. The Manager and Calling System play the roles of Concrete Handlers. At first, the Customer registers at the Reservation System. The Reservation System will send the request to Manager to check if there is any table available. If there is available, the Manager can lead the Customer to the free table. If there is no available table, then the Reservation System will put the Customer in a waiting queue. When there is a table available, the Reservation System will send the first Customer in the waiting queue to the Calling System, and the Calling System will inform the Customer.
