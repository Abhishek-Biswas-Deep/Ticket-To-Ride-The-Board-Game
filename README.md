<img src="https://github.com/user-attachments/assets/2ad86f70-12b4-4500-997d-9f8c1874a9b5" alt="Dal logo" width="80"/>
<h1>Associated with Dalhousie University</h1>

### CSCI2110
#### Ticket-To-Ride-The-Board-Game
This project solves a simplified version of the popular board game "Ticket to Ride." The goal of the game is to construct the most efficient rail network between cities based on prescribed routes. This program computes the total cost of constructing a rail network by choosing the shortest available route for each pair of cities.

#### Problem Overview

In "Ticket to Ride," players are assigned routes between cities on a game board, where each segment between cities has a construction cost. The objective is to build a rail network that connects these cities with the minimum cost. This program simulates this task by calculating the shortest paths between cities and outputting the total cost of building these routes.

#### Features
- **Shortest Path Calculation**: The program reads a game board and computes the shortest path between cities using Dijkstra's algorithm.
- **Efficient Rail Network Construction**: Routes between cities are constructed with the minimal possible cost, and routes that share segments only count those segments once.
- **Clean and Sorted Output**: The list of rail segments used is displayed in lexicographical order, and the total cost of the rail network is computed.

#### Input Format
The program reads input from the console in two sections:
1. **Game Board**: A list of city pairs with the length of the rail segment between them.
2. **Routes**: A list of city pairs representing the routes to be constructed.

Each section ends with the keyword `done`.

**Sample input**-
```
 Charleston 2 Raleigh
 Chicago 3 Pittsburgh
 Chicago 2 Saint_Louis
 Chicago 4 Omaha
 Chicago 3 Duluth
 Dallas 2 Little_Rock
 Dallas 2 Oklahoma_City
 Denver 4 Omaha
 Denver 4 Kansas_City
 Denver 4 Oklahoma_City
 Denver 2 Santa_Fe
 Denver 3 Salt_Lake_City
 Duluth 2 Omaha
 Duluth 6 Helena
 Helena 4 Winnipeg
 Helena 5 Omaha
 Helena 4 Denver
 Helena 3 Salt_Lake_City
 Kansas_City 2 Saint_Louis
 Kansas_City 2 Oklahoma_City
 Kansas_City 1 Omaha
 Las_Vegas 3 Salt_Lake_City
 Little_Rock 3 Nashville
 Little_Rock 2 Oklahoma_City
 Little_Rock 2 Saint_Louis
 Nashville 3 Raleigh
 Nashville 2 Saint_Louis
 Nashville 4 Pittsburgh
 New_York 2 Washington
 New_York 2 Pittsburgh
 Oklahoma_City 3 Santa_Fe
 Pittsburgh 2 Washington
 Pittsburgh 2 Raleigh
 Pittsburgh 5 Saint_Louis
 Raleigh 2 Washington
 Saint_Louis 2 Chicago
 done
 Denver Washington
 Chicago Oklahoma_City
 done
```
**Sample output**-
```
The rail network consists of:
  Chicago 2 Saint_Louis
  Denver 4 Kansas_City
  Kansas_City 2 Saint_Louis
  Little_Rock 2 Oklahoma_City
  Little_Rock 2 Saint_Louis
  Nashville 3 Raleigh
  Nashville 2 Saint_Louis
  Raleigh 2 Washington
The total cost is: 19
```
#### How to Run-
1. **Compile the program**.
2. **Run the program**.
3. **Provide input**: Enter the game board and routes according to the format mentioned above.

#### Algorithm
- **Graph Representation**: The game board is represented as a weighted undirected graph.
- **Dijkstra's Algorithm**: The program uses Dijkstra’s algorithm to compute the shortest path between the cities.
- **Route Construction**: The total cost of the rail network is calculated by summing up the shortest distances for all specified routes.
