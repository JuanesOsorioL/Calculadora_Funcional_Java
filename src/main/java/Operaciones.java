import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Operaciones {

   static IntBinaryOperator suma = (a,b) -> a + b;

   static IntBinaryOperator resta = (a,b) -> a - b;

   static IntBinaryOperator multiplicacion = (a,b) -> {
        Integer resultado= IntStream.range(0,Math.abs(b)+1)
                .reduce((acumulador,numero)->suma.applyAsInt(Math.abs(a),acumulador)).getAsInt();
        if ((a<0 && b>0) || (a>0 && b<0))
            resta.applyAsInt(0,resultado);
        return resultado;
    };

    static IntBinaryOperator division = (a,b) -> {
        return IntStream.range(0,Math.abs(a)+1)
                .reduce((acumulador,numero) -> {
                    if(multiplicacion.applyAsInt(b, numero) <= a)
                        acumulador++;
                    return acumulador;
                }).getAsInt();
    };

}
