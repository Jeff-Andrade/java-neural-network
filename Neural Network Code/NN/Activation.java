package NN;

public class Activation

{

    public static double sigmoid(double x)

    {

        double y;

        y = 1 / (1 + Math.exp(-x));

        return y;

    }

    public static double tanh(double x)

    {

        double y;

        y = Math.tanh(x);

        return y;

    }

    public static double relu(double x)

    {

        if (x > 0)

        {

            return x;

        }

        else

        {

            return 0;

        }

    }

}
