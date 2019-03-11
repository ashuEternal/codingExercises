package internshala;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
        public int compare(Student s1,Student s2)
        {
            if(s1.getCGPA()<s2.getCGPA())
                return 1;
            else if(s2.getCGPA()<s1.getCGPA())
                return -1;
            else{
                if(!(s1.getName().compareTo(s2.getName())==0)) {
                    return s1.getName().compareTo(s2.getName());
                }
                else
                {
                    if(s1.getToken()<s2.getToken())
                        return 1;
                    else if(s1.getToken()>s2.getToken())
                        return -1;
                    else
                        return 0;
                }
            }

        }
}
