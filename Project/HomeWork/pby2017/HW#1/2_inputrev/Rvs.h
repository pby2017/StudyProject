#include <iostream>
#include <string>

using namespace std;

class Rvs
{
private:
    string input; // input string
    string output; // reverse input string
    int input_length; // input string length
    int i; // for repeat value
public:
    Rvs(string value); // creator
    void New_input(string newinput); // input string
    void Length_input(); // get string length
    void Rvs_input(); // reverse input string
    void Print(); // print input and output
    ~Rvs(); // destroy
};
