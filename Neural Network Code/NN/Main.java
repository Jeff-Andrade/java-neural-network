package NN;

import java.util.ArrayList;

public class Main

{

    public static void main(String[] args)

    {

        ArrayList<Double> inputs = new ArrayList<Double>();
        ArrayList<Integer> neurons = new ArrayList<Integer>();
        String activation;

        //For demonstration purposes
        activation = "sigmoid";

        inputs.add(0.5);
        inputs.add(-1.25);

        neurons.add(2);
        neurons.add(5);
        neurons.add(3);

        //

        Network n1 = new Network(inputs, neurons, activation);

    }

}
