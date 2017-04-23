#include "Rvs.h"
#include <iostream>
#include <string>

using namespace std;

int main()
{
    string str; // make string value
    cout<<"input: "; // print require to input message
    getline(cin,str); // input string to use getline for blank*/

    Rvs rvs(str); // creator
    rvs.New_input(str); // new input string
    rvs.Print(); // print input and output

    return 0; // bye
}
