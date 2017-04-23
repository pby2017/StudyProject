class Student
{
private:
    char* stud_name; // student name
    int stud_num; // student number
    int stud_grad; // student grade
    float stud_scor; // student score
public:
    Student(char* name, int number, int grade, float score); // creator
    void Insertname(char* iname); // name update
    void Insertnumber(int inumber); // number update
    void Insertgrade(int igrade); // grade update
    void Insertscore(int iscore); // score update
    void Print(); // print information
    ~Student(); // destroy
};
