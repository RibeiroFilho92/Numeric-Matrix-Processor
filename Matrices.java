import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu();
		int option = sc.nextInt();
		
		while (option != 0) {
			if (option == 0) {
				System.exit(0);
			}
			else if (option == 1) {
				System.out.print("Enter size of first matrix: ");
				int linesOne = sc.nextInt();
				int columnsOne = sc.nextInt();
				double[][] matriceOne = new double[linesOne][columnsOne];
				
				System.out.println("Enter first matrix: ");
					for(int i = 0; i < linesOne; i++) {
						for(int j = 0; j < columnsOne; j++) {
							matriceOne[i][j] = sc.nextDouble();
						}
					}
				
				System.out.print("Enter size of second matrix: ");
				int linesTwo = sc.nextInt();
				int columnsTwo = sc.nextInt();
				if (linesOne != linesTwo && columnsOne != columnsTwo) {
					System.out.println("The operation cannot be performed.");
					return;
				}
				double[][] matriceTwo = new double[linesTwo][columnsTwo];		
				
				System.out.println("Enter second matrix: ");
					for(int i = 0; i < linesTwo; i++) {
						for(int j = 0; j < columnsTwo; j++) {
							matriceTwo[i][j] = sc.nextDouble();
						}
					}
				
				System.out.println("The result is: ");
				double[][] sum = new double[linesTwo][columnsTwo];
					for(int i = 0; i < linesTwo; i++) {
						for(int j = 0; j < columnsTwo; j++) {
							sum[i][j] = matriceOne[i][j] + matriceTwo[i][j];
							double aux = sum[i][j];
							System.out.print(aux + " ");
						}
						System.out.println();
					}
				
					System.out.println();
					menu();
					option = sc.nextInt();
			}
			else if (option == 2) {
				System.out.print("Enter size of matrix: ");
				int linesOne = sc.nextInt();
				int columnsOne = sc.nextInt();
				double[][] matriceOne = new double[linesOne][columnsOne];
				
				System.out.println("Enter matrix:");
					for(int i = 0; i < linesOne; i++) {
						for(int j = 0; j < columnsOne; j++) {
							matriceOne[i][j] = sc.nextDouble();
						}
					}

				System.out.println("Enter constant:");
				int constant = sc.nextInt();
				
				System.out.println("The result is:");
					for(int i = 0; i < linesOne; i++) {
						for(int j = 0; j < columnsOne; j++) {
							matriceOne[i][j] = matriceOne[i][j] * constant;
							System.out.print(matriceOne[i][j] + " ");
						}
						System.out.println();
					}
				
				System.out.println();
				menu();
				option = sc.nextInt();
			}
			else if (option == 3) {
				System.out.print("Enter size of matrix: ");
				int linesOne = sc.nextInt();
				int columnsOne = sc.nextInt();
				double[][] matriceOne = new double[linesOne][columnsOne];
				
				System.out.println("Enter matrix:");
					for(int i = 0; i < linesOne; i++) {
						for(int j = 0; j < columnsOne; j++) {
							matriceOne[i][j] = sc.nextDouble();
						}
					}
				
				System.out.print("Enter size of second matrix: ");
				int linesTwo = sc.nextInt();
				int columnsTwo = sc.nextInt();
					if (columnsOne != linesTwo) {
						System.out.println("The operation cannot be performed.");
						System.exit(0);
					}
				double[][] matriceTwo = new double[linesTwo][columnsTwo];		
					
				System.out.println("Enter second matrix: ");
					for(int i = 0; i < linesTwo; i++) {
						for(int j = 0; j < columnsTwo; j++) {
							matriceTwo[i][j] = sc.nextDouble();
						}
					}
					
				System.out.println("The result is:");
				double[][] mult = new double[linesOne][columnsTwo];
		
				for (int i = 0; i < linesOne; i++) {
						for (int j = 0; j < columnsTwo; j++) {
							double value = 0.0;
								
								for (int h = 0; h < linesTwo; h++) {
									value += matriceOne[i][h] * matriceTwo[h][j];
								}
								
							mult[i][j] += value;	
						
					}
				}
				
				for(int i = 0; i < linesOne; i++) {
					for(int j = 0; j < columnsTwo; j++) {
						System.out.print(mult[i][j] + " ");
					}
					System.out.println();
				}
				
				System.out.println();
				menu();
				option = sc.nextInt();
			}
			else if (option == 4) {
				System.out.println("1. Main diagonal");
				System.out.println("2. Side diagonal");
				System.out.println("3. Vertical line");
				System.out.println("4. Horizontal line");
				System.out.print("Your choice: ");
				int choice = sc.nextInt();
				
				System.out.print("Enter size of matrix: ");
				int linesOne = sc.nextInt();
				int columnsOne = sc.nextInt();
				double[][] matriceOne = new double[linesOne][columnsOne];
				
				System.out.println("Enter matrix:");
					for(int i = 0; i < linesOne; i++) {
						for(int j = 0; j < columnsOne; j++) {
							matriceOne[i][j] = sc.nextDouble();
						}
					}
				
				double[][] mult = new double[linesOne][columnsOne];	
					
				if (choice == 1) {

					for (int i = 0; i < linesOne; i++) {
						for (int j = 0; j < linesOne; j++) {
							mult[j][i] = matriceOne[i][j];
						}
					}
					
					for(int i = 0; i < linesOne; i++) {
						for(int j = 0; j < columnsOne; j++) {
							System.out.print(mult[i][j] + " ");
						}
						System.out.println();
					}
				}
				else if (choice == 2) {
					int auxOne = (linesOne - 1); 
					int auxTwo = (linesOne - 1); 
					
					for (int i = 0; i < linesOne; i++) {
						for (int j = 0; j < linesOne; j++) {
							mult[j][i] = matriceOne[auxOne][auxTwo];
							auxTwo--;
						}
						auxOne--;
						auxTwo = (linesOne - 1);
					}
					
					for(int i = 0; i < linesOne; i++) {
						for(int j = 0; j < columnsOne; j++) {
							System.out.print(mult[i][j] + " ");
						}
						System.out.println();
					}
				}
				else if (choice == 3) {
					
					for(int i = 0; i < linesOne; i++) {
						for(int j = columnsOne - 1; j >= 0; j--) {
							System.out.print(matriceOne[i][j] + " ");
						}
						System.out.println();
					}
				}
				else if (choice == 4) {
					
					int auxOne = (linesOne - 1); 
					
					for (int i = 0; i < linesOne; i++) {
						for (int j = 0; j < linesOne; j++) {
							mult[i][j] = matriceOne[auxOne][j];
						}
						auxOne--;
					}
					
					for(int i = 0; i < linesOne; i++) {
						for(int j = 0; j < columnsOne; j++) {
							System.out.print(mult[i][j] + " ");
						}
						System.out.println();
					}
				}
					
					
				System.out.println();
				menu();
				option = sc.nextInt();
			}
			else if (option == 5) {
				System.out.print("Enter size of matrix: ");
				int linesOne = sc.nextInt();
				int columnsOne = sc.nextInt();
				double[][] matriceOne = new double[linesOne][columnsOne];
				
				System.out.println("Enter matrix:");
					for(int i = 0; i < linesOne; i++) {
						for(int j = 0; j < columnsOne; j++) {
							matriceOne[i][j] = sc.nextDouble();
						}
					}
				
				System.out.println("The result is:");	
				System.out.format("%.5f", determinant(matriceOne));
				
				System.out.println();
				menu();
				option = sc.nextInt();
			}
			else if (option == 6) {
				System.out.print("Enter size of matrix: ");
				int linesOne = sc.nextInt();
				int columnsOne = sc.nextInt();
				double[][] matriceOne = new double[linesOne][columnsOne];
				
				System.out.println("Enter matrix:");
				for(int i = 0; i < linesOne; i++) {
					for(int j = 0; j < columnsOne; j++) {
						matriceOne[i][j] = sc.nextDouble();
					}
				}
			
			
			
			System.out.println("The result is:");	
			inverse(matriceOne);
			
			System.out.println();
			menu();
			option = sc.nextInt();
			}
		}
	}

	public static void menu() {
		System.out.println("1. Add matrices");
		System.out.println("2. Multiply matrix by a constant");
		System.out.println("3. Multiply matrices");
		System.out.println("4. Transpose matrix");
		System.out.println("5. Calculate a determinant");
		System.out.println("6. Inverse matrix");
		System.out.print("Your choice: ");
	}
	
	public static double determinant(double[][] matriceOne) {
		int lft = matriceOne[0].length - 1;
		if (matriceOne[0].length == 2) {
			double determinant = (matriceOne[0][0] * matriceOne[1][1]) - (matriceOne[0][1] * matriceOne[1][0]);
			return determinant;	
		}
		else if (matriceOne[0].length == 3) {
			double determinant = 0;
			double[][] twoTwo = new double[matriceOne[0].length - 1][matriceOne[0].length - 1];
			
			for (int i = 0; i < matriceOne[0].length - 1; i++) {
				for (int j = 0; j < matriceOne[0].length - 1; j++) {
					twoTwo[i][j] = matriceOne[i + 1][j + 1];
				}
			}
			determinant += matriceOne[0][0]	* determinant(twoTwo);
			twoTwo = new double[matriceOne[0].length][matriceOne[0].length - 1];
			
			for (int i = 0; i < matriceOne[0].length - 1; i++) {
				for (int j = 0; j < matriceOne[0].length - 1; j++) {
					if (j == 0) {
						twoTwo[i][j] = matriceOne[i + 1][j];
					}
					else {
						twoTwo[i][j] = matriceOne[i + 1][j + 1];
					}
				}
			}
			determinant -=	matriceOne[0][1] * determinant(twoTwo);
			twoTwo = new double[matriceOne[0].length][matriceOne[0].length - 1];
			
			for (int i = 0; i < matriceOne[0].length - 1; i++) {
				for (int j = 0; j < matriceOne[0].length - 1; j++) {
					twoTwo[i][j] = matriceOne[i + 1][j];
				}
			}
			determinant +=	matriceOne[0][2] * determinant(twoTwo);
			return determinant;
		}
		else if (matriceOne[0].length > 3) {

			double determinant = 0;
			double[][] arr = new double[lft][lft];
			
			for (int i = 0; i <= lft; i++) {
				for (int j = 0; j <lft; j++) {
					for (int k = 0; k < lft; k++) {
						if (i == 0) {
							arr[j][k] = matriceOne[j+1][k+1];
						}
						if (i > 0 && k < i) {
							arr[j][k] = matriceOne[j+1][k];
						} else if (i > 0 && k > i || i > 0 && k == i) {
							arr[j][k] = matriceOne[j+1][k+1];
						} else if (i == lft && k > 0) {
							arr[j][k] = matriceOne[j+1][k];
						}
					}
				}		
				if (i % 2 == 0 || i == 0) {
					determinant += matriceOne[0][i] * determinant(arr);
					arr = new double[lft][lft];
				}
				else {
					determinant -= matriceOne[0][i] * determinant(arr);
					arr = new double[lft][lft];
				}
			}
			return determinant;
		}
		return 0.0;
	}
	
	public static void inverse(double[][] matriceOne) {
		int lft = matriceOne[0].length;
		double[][] arr = new double[lft][lft];
		
		if (determinant(matriceOne) != 0) {
			
			double[][] aux = new double[lft - 1][lft - 1];
			
			for (int i = 0; i < lft ; i++) {
				for (int j = 0; j <lft; j++) {
					
						for (int k = 0; k < aux[0].length; k++) {
							for (int l = 0; l < aux[0].length; l++) {
								
							if (i == 0) {
								if (j == 0) {
									aux[k][l] = matriceOne[k + 1][l + 1];
								}
								else if (l < j) {
									aux[k][l] = matriceOne[k + 1][l];
								}
								else if (l >= j) {
									aux[k][l] = matriceOne[k + 1][l + 1];
								}
								else if (l >= j) {
									aux[k][l] = matriceOne[k + 1][l + 1];
								}
								else if (j == lft - 1) {
									aux[k][l] = matriceOne[k + 1][l + 1];
								}
							}
							
							if (i > 0 && i < (lft - 1)) {
								if (j == 0) {
									if (k < i) {
										aux[k][l] = matriceOne[k][l + 1];
									}
									else if (k >= i) {
										aux[k][l] = matriceOne[k + 1][l + 1];
									}
								}
								else if (j > 0 && j < aux[0].length) {
									if (k < i && l < j) {
										aux[k][l] = matriceOne[k][l];
									}
									else if (k < i && l >= j) {
										aux[k][l] = matriceOne[k][l + 1];
									}
									else if (k >= i && l < j) {
										aux[k][l] = matriceOne[k + 1][l];
									}
									else if (k >= i && l >= j) {
										aux[k][l] = matriceOne[k + 1][l + 1];
									}
								}
								else if (j == lft - 1) {
									if (k < i) {
										aux[k][l] = matriceOne[k][l];
									}
									else if (k >= i) {
										aux[k][l] = matriceOne[k + 1][l];
									}
								}
							}
							
							if (i == lft - 1) {
								if (j == 0) {
									aux[k][l] = matriceOne[k][l + 1];
								}
								else if (l < j) {
									aux[k][l] = matriceOne[k][l];
								} 
								else if (l >= j) {
									aux[k][l] = matriceOne[k][l + 1];
								}
								else if (j == (lft - 1)) {
									aux[k][l] = matriceOne[k][l];
								}
							}
						}		
					}	
					if ((i + j) % 2 == 0 || (i + j) == 0) {
						arr[i][j] = determinant(aux);
						aux = new double[lft - 1][lft - 1];
					}
					else {
						arr[i][j] = determinant(aux) != 0 ? determinant(aux) * -1 : determinant(aux);
						aux = new double[lft - 1][lft - 1];
					}
				}	
			}
		}
		else {
			System.out.println("This matrix doesn't have an inverse.");
			return;
		}
		
		double[][] inverseFactor = new double[lft][lft];
		
		for (int i = 0; i < lft; i++) {
			for (int j = 0; j < lft; j++) {
				inverseFactor[j][i] = arr[i][j];
			}
		}
		
		for(int i = 0; i < lft; i++) {
			for(int j = 0; j < lft; j++) {
				System.out.format("%.2f ", inverseFactor[i][j] / determinant(matriceOne));
			}
			System.out.println();
		}

	}
	
}
