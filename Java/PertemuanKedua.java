public class PertemuanKedua {

    public static void main(String[] args) {
        String[] pub = {"Awaludin","Imron","Sri","Aren","Ari","Arie","Burhannudin"};
        int[] jarak = {98,300,205,150,150,1500,60};
        int tamp;
        float rataRata=0;
        String tam;
        for(int i = 0;i < jarak.length-1; i++){
            for(int j = 0;j < jarak.length-1; j++){
                if(jarak[j] <= jarak[j+1]){
                    tamp=jarak[j];
                    jarak[j]=jarak[j+1];
                    jarak[j+1]=tamp;

                    tam = pub[j];
                    pub[j] = pub[j+1];
                    pub[j+1] = tam;
                }
            }
        }
        System.out.println("Jarak terjauh, nama : " + pub[0] + " dengan jarak " + jarak[0]);
        
        System.out.println("Jarak terdekat, nama :" + pub[6] + " dengan jarak " + jarak[6]);
	

        for(int i:jarak){
            rataRata+=i;
        }
        System.out.println("Jarak rata-rata mahasiswa PUB ke pasim yaitu " + rataRata/7);
    }
}
