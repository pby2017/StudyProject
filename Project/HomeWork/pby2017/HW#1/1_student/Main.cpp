#include "Student.h"
#include <iostream>

using namespace std;

int main(int argc, char* argv[])
{
    Student stud("Yetnal",32121820,4,4.5); // new creator
    stud.Print(); // information print
    stud.Insertname("Saenaegi"); // name update
    stud.Insertnumber(32171820); // number update
    stud.Insertgrade(1); // grade update
    stud.Insertscore(0); // score update
    stud.Print(); // information print
    return 0; // bye
}
