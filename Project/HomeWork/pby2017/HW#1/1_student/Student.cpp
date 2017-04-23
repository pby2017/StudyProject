#include "Student.h"
#include <iostream>

using namespace std;

Student::Student(char *name=0, int number=0, int grade=0, float score=0)
:stud_num(number), stud_grad(grade), stud_scor(score)
// creator set, value set
{
    stud_name = new char[15]; // assign new array
    stud_name = name; // name init
}

Student::~Student() // destroy
{
}

void Student::Insertname(char* iname) // name update
{
    stud_name = iname;
}
void Student::Insertnumber(int inumber) // number update
{
    stud_num = inumber;
}
void Student::Insertgrade(int igrade) // grade update
{
    stud_grad = igrade;
}
void Student::Insertscore(int iscore) // score update
{
    stud_scor = iscore;
}

void Student::Print() // print information
{
    cout<<"---------------"<<"\nname:    "<<stud_name<<
    "\nnumber:  "<<stud_num<<
    "\ngrade:   "<<stud_grad<<
    "\nscore:   "<<stud_scor<<endl;
}
