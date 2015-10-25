
public class MatrixMainClass {
    

	public static void main(String args[]){
        

	Matrix MatrixClass = new Matrix();
        
        

	Matrix matrixA = new Matrix();
        
	Matrix matrixB = new Matrix();
        
       
 	System.out.println("matrix a");
        

	matrixA.setCell(0,0,0);
        
	matrixA.setCell(0,1,1);
        
	matrixA.setCell(0,2,2);
        
	matrixA.setCell(0,3,3);
        
	matrixA.setCell(1,0,4);
        
	matrixA.setCell(1,1,5);
        
	matrixA.setCell(1,2,6);
        
	matrixA.setCell(1,3,7);
        
	matrixA.setCell(2,0,8);
        
	matrixA.setCell(2,1,9);
        
	matrixA.setCell(2,2,0);
        
	matrixA.setCell(2,3,1);
        
	matrixA.setCell(3,0,2);
        
	matrixA.setCell(3,1,3);
        
	matrixA.setCell(3,2,4);
        
	matrixA.setCell(3,3,5);
        
	matrixA.displayMatrix();
        
        
	System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        
	System.out.println("matrix b");
        
	matrixB.setCell(0,0,1);
        
	matrixB.setCell(0,1,2);
        
	matrixB.setCell(0,2,3);
        
	matrixB.setCell(0,3,4);
        
	matrixB.setCell(1,0,5);
        
	matrixB.setCell(1,1,6);
        
	matrixB.setCell(1,2,7);
        
	matrixB.setCell(1,3,8);
        
	matrixB.setCell(2,0,9);
        
	matrixB.setCell(2,1,0);
        
	matrixB.setCell(2,2,1);
        
	matrixB.setCell(2,3,2);
        
	matrixB.setCell(3,0,3);
        
	matrixB.setCell(3,1,4);
        
	matrixB.setCell(3,2,5);
        
	matrixB.setCell(3,3,6);
        
	matrixB.displayMatrix();
        
        
	System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        
	MatrixClass.addMatrices(matrixA, matrixB);
        
	MatrixClass.displayMatrix();
    
	}
    
    

}
