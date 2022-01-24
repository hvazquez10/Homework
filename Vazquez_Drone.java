package inHome;
import java.util.Scanner;

//Hector Vazquez
//Date: 1/16/2022
//Vazquez_Drone
//Purpose: Simulation using button, drone movement in x, y,z location



public class Vazquez_Drone {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Creating Drone Object
		Control drone = new Control();
		
		int choice = 0;
		//Display Menu
		while(choice != 8) {
		System.out.println("Which direction would you like to move?");
		System.out.println("1 - Move up");
		System.out.println("2 - Move down");
		System.out.println("3 - Move forward");
		System.out.println("4 - Move backward");
		System.out.println("5 - Turn left");
		System.out.println("6 - Turn right");
		System.out.println("7 - Display Position");
		System.out.println("8 - Exit Navigation");
		choice = input.nextInt();
		
		//Calling methods to move direction
		switch(choice) {
		
		case 1:
			drone.moveUp();
			break;
		
		case 2:
			drone.moveDown();
			break;
			
		case 3:
			drone.forward();
			break;
			
		case 4:
			drone.backwards();
			break;
			
		case 5:
			drone.turnLeft();
			break;
			
		case 6:
			drone.turnRight();
			break;
			
		case 7:
			drone.display();
			break;
			
		case 8:
			break;
		}
		
		}
		
		input.close();
	}
	
}

class Control{
	
	private int x,y,z;
	private int direction;
	//constructor for drone object
	public Control() {
		
		x = 0;
		y = 0;
		z = 0;
		direction = 0;
	}
	//setters and getters for object
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	//method for moving up
	public void moveUp() {
		z += 1;
	}
	//method for moving down
	public void moveDown() {
		z -= 1;
	}
	//method to move forward
	public void forward() {
		if(direction == 0) {
			y += 1;
		}
		
		else if(direction == 1) {
			x += 1;
		}
		
		else if(direction == 2) {
			y -= 1;
		}
		
		else {
			x -= 1;
		}
	}
	// method to move backwards	
	public void backwards () {
			if(direction == 0) {
				y -= 1;
			}
			
			else if(direction == 1) {
				x -= 1;
			}
			
			else if(direction == 2) {
				y += 1;
			}
			
			else {
				x += 1;
			}
	}
			//method to turn right
			public void turnRight() {
				direction = (direction + 1) % 4;
			}
			//method to turn left
			public void turnLeft() {
				direction--;
				if(direction < 0) {
					direction = 3;
				}
			}
			
			
			public void display() {
				 System.out.println("Drone is at x = " + x + " ,y = " + y + " ,z = " + z);
			}
	}
	
	
	
	
	
	
	
	

