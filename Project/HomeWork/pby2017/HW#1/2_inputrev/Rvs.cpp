#include "Rvs.h"
#include <iostream>
#include <string>

using namespace std;

Rvs::Rvs(string value) // creator
{
    input = value; // put value to input
    cout<<"Rvs: "<<input<<endl;
}

void Rvs::New_input(string newinput) // input string
{
    input = newinput; // put newinput to input
}

void Rvs::Length_input() // get string length
{
    input_length = input.length(); // input.length() already exists
}

void Rvs::Rvs_input()
// get string length and reverse input string
{
    Length_input(); //
    output = input;
    // make output length like input length because output has nothing yet
    for(i=0; i<input_length; i++)
    {
        output[i] = input[input_length-i-1];
        // [input_length-i-i] is end index of input string
    }
}

void Rvs::Print() // print input and output
{
    Rvs_input(); // reverse input string
    cout<<"----------\n"<<"bef : "<<input<<"\naft : "<<output<<endl;
}

Rvs::~Rvs() // destroy
{
}
