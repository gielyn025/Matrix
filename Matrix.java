
class Matrix {
    
    

	final int size = 4;
    

	private int[][] squares = new int [size][size];
       
            

	public void addMatrices(Matrix a, Matrix b){
                
	int c,d;
                

	for(c = 0; c<size ;c++){
                    
		for(d = 0; d<size; d++ ){
                        
	squares[c][d]=a.getCell(c, d) + b.getCell(c, d);
                    
		}       
                
	}   
            
}

            
             
	public int getCell(int c, int d){
             
	return squares[c][d];
             
	}
             
            

	public void setCell(int c, int d, int value){
                
	this.squares[c][d] = value;   
            }
            
            
            

	public void displayMatrix(){
                
	int c,d;
                
	for(c=0; c<size; c++){
                    
		for(d=0; d<size; d++){
                        
	System.out.print(this.getCell(c,d) + "\t");
                    
	}
                   
	System.out.println();
                
		}
                
            
	}

}

