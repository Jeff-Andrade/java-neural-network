package NN;

import java.util.ArrayList;
import java.util.Random;

public class Neuron

{

    public ArrayList<Double> neuronInput = new ArrayList<Double>();
    private ArrayList<Double> weights = new ArrayList<Double>();
    private double bias;
    public double inputSize;
    public double neuronOutput;

    public void generate_values()

    {

        ArrayList<Double> weights = new ArrayList<Double>();

        Random r = new Random();

        for (int i = 0; i < this.inputSize; i++)

        {

            weights.add(r.nextGaussian());

        }

        this.weights = weights;
        this.bias = r.nextGaussian();

    }

    public void dot_product()

    {

        double neuronOutput = 0;

        for (int i = 0; i < this.inputSize; i++)

        {

            neuronOutput += (this.neuronInput.get(i) * this.weights.get(i)) + this.bias;

        }

        this.neuronOutput = neuronOutput;

    }

}
