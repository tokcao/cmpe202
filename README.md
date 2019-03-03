# cmpe202


CRC Cards


-------------------------------------------------------------------------------------------------
                                                Customer                                        |
-------------------------------------------------------------------------------------------------
Responsibilities                                                |         Collaborators         |
                                                                |                               |
Register in the reservation system                              |         Reservation System    |
Check the wait list                                             |         Calling System        |
Cancel reservation                                              |                               |
Informed by calling system                                      |                               |
Confirm reservation                                             |                               |
-------------------------------------------------------------------------------------------------


-------------------------------------------------------------------------------------------------
                                                Manager                                         |
-------------------------------------------------------------------------------------------------
Responsibilities                                                |         Collaborators         |
                                                                |                               |
Check table availability                                        |         Reservation System    |
Inform reservation system when table is available               |         Calling System        |
                                                                |                               |
                                                                |                               |
                                                                |                               |
-------------------------------------------------------------------------------------------------
                                                    
                                                    
-------------------------------------------------------------------------------------------------
                                            Reservation System                                  |
-------------------------------------------------------------------------------------------------
Responsibilities                                                |         Collaborators         |
                                                                |                               |
Add a customer in queue                                         |         Customer              |
Remove a customer in queue                                      |         Calling System        |
Show current wait list                                          |                               |
Send the first customer in queue to calling system              |                               |
                                                                |                               |
-------------------------------------------------------------------------------------------------


-------------------------------------------------------------------------------------------------
                                              Calling System                                    |
-------------------------------------------------------------------------------------------------
Responsibilities                                                |         Collaborators         |
                                                                |                               |
Get the first customer in queue from reservation system         |         Customer              |
Find the contact information of the first customer              |         Calling System        |
Inform the first customer the table is ready                    |                               |
Get confirmation from customer                                  |                               |
                                                                |                               |
-------------------------------------------------------------------------------------------------


Explanation to communication diagram.

  The design pattern I chose was Chain of Responsibility Design Pattern. In my design, the role of Customer is Client. Reservation System works as the Handler. The Manager and Calling System play the roles of Concrete Handlers. At first, the Customer registers at the Reservation System. The Reservation System will send the request to Manager to check if there is any table available. If there is available, the Manager can lead the Customer to the free table. If there is no available table, then the Reservation System will put the Customer in a waiting queue. When there is a table available, the Reservation System will send the first Customer in the waiting queue to the Calling System, and the Calling System will inform the Customer.
