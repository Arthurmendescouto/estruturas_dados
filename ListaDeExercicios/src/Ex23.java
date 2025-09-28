import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Ex23 {
    public static double bytesParaMB(long bytes) {
        return bytes / (1024.0 * 1024.0);
    }

    public static double calculaPercentual(double valor, double total) {
        return (valor / total) * 100.0;
    }

    public static void main(String[] args) {
        String entrada = "usuarios.txt";
        String saida = "relatorio.txt";

        List<String> usuarios = new ArrayList<>();
        List<Long> espacos = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(entrada));
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split("\\s+");
                for (int i = 0; i < partes.length; i += 2) {
                    usuarios.add(partes[i]);
                    espacos.add(Long.parseLong(partes[i + 1]));
                }
            }
            br.close();

            List<Double> espacosMB = new ArrayList<>();
            double totalMB = 0.0;

            for (long espaco : espacos) {
                double emMB = bytesParaMB(espaco);
                espacosMB.add(emMB);
                totalMB += emMB;
            }

            double mediaMB = totalMB / usuarios.size();

            BufferedWriter bw = new BufferedWriter(new FileWriter(saida));
            bw.write("ACME Inc.               Uso do espaço em disco pelos usuários\n");
            bw.write("------------------------------------------------------------------------\n");
            bw.write(String.format("%-4s %-15s %-20s %s\n", "Nr.", "Usuário", "Espaço utilizado", "% do uso"));

            for (int i = 0; i < usuarios.size(); i++) {
                String usuario = usuarios.get(i);
                double espacoMB = espacosMB.get(i);
                double percentual = calculaPercentual(espacoMB,totalMB);

                bw.write(String.format("%-4d %-15s %10.2f MB %10.2f%%\n",i+1,usuario,espacoMB,percentual));
            }

            bw.write("\n");
            bw.write(String.format("Espaço total ocupado: %.2f MB\n", totalMB));
            bw.write(String.format("Espaço medio ocupado: %.2f MB\n", mediaMB));

            bw.close();
            System.out.println("Relatório gerado com sucesso em: "+saida);

        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

    }
}
