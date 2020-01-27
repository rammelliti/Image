
package image;

public class Image {

    public static void main(String[] args) {
        int i,j;
        
        int Matrice[][]=new int [][]{
                                {25,28,100,100,100,100},
                                {44,45,50,100,100,100},
                                {65,65,50,20,100,100},
                                {90,62,100,5,0,0},
                                {60,87,100,0,100,100}   };
        for(i=0;i<5;i++){
            System.out.println();
            for(j=0;j<6;j++){
                System.out.print(Matrice[i][j]+"\t");
            }
        }
        ///*********Affichage de nuance inversé ***********///
         System.out.print("\n Nuance inversé :");
         int [][] matInv=Mystere(Matrice);
         for(int k=0;k<5;k++){
            System.out.print("\n");
            for(int l=0;l<6;l++){
                System.out.print(matInv[k][l]+"\t");
            }
        }
         ///////********** Affichage moyenne******************************************
         System.out.print("\n La saturation moyenne vaut : "+Moyenne(Matrice));
         ///**********Affichage de matrice avec les Contrastes diminués ******
         System.out.print("\n Contrast Diminué :");
         int [][] matDim=DiminuantContrast(Matrice);
          for(i=0;i<5;i++){
            System.out.println();
            for(j=0;j<6;j++){
                System.out.print(matDim[i][j]+"\t");
            }
        }
    }
    
    
    //////**************** fonction Mystere *************************
    public static int[][] Mystere(int [][]M){
        
        //int [][] matrice1=new int[5][6];
         int matrice1[][]=new int [][]{
                                {25,28,100,100,100,100},
                                {44,45,50,100,100,100},
                                {65,65,50,20,100,100},
                                {90,62,100,5,0,0},
                                {60,87,100,0,100,100}   };
         for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                matrice1[i][j]=100-matrice1[i][j];
            }
        }
        return matrice1;
    }
    
    //////***************** fonction Moyenne **********************
    public static double Moyenne(int[][]M){
     int matrice1[][]=new int [][]{
                                {25,28,100,100,100,100},
                                {44,45,50,100,100,100},
                                {65,65,50,20,100,100},
                                {90,62,100,5,0,0},
                                {60,87,100,0,100,100}   };
     int som=0;
     double moy;
     for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                som=som+matrice1[i][j];
            }
    }
     moy=som/30.0;
     return moy;
    }
    
    /////////////*******************Fonction Diminuant Contrast*******************
    public static int[][] DiminuantContrast(int [][]M){
        
        int matrice2[][]=new int [][]{
                                {25,28,100,100,100,100},
                                {44,45,50,100,100,100},
                                {65,65,50,20,100,100},
                                {90,62,100,5,0,0},
                                {60,87,100,0,100,100}   };
        
    
         for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                if(matrice2[i][j]>Moyenne(matrice2)) 
		    matrice2[i][j]=50;
	        else 
                    matrice2[i][j]=matrice2[i][j]/2;
            }
        }
        return matrice2;
    }
}
