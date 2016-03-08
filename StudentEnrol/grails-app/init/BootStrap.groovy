import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->
    
def course1= new Course( title:'Interactive Media with Animation',
                    department:'Computing',
                    description:'"Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei."',
                    leader:'Joe Jojo',
                    code:'IMA101',
                    startDate: new Date('19/01/2015'),
                    endDate: new Date('19/01/2020')).save()

def course2= new Course( title:'Professional Computing Project',
                    department:'Computing',
                    description:'"Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei."',
                    leader:'Chloe Acland',
                    code:'PCP101',
                    startDate: new Date('19/01/2015'),
                    endDate: new Date('19/01/2020')).save()

def course3= new Course( title:'Web Architecture',
                    department:'Computing',
                    description:'"Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei."',
                    leader:'Dom Woodward',
                    code:'WAR101',
                    startDate: new Date('19/01/2015'),
                    endDate: new Date('19/01/2020')).save()

    
def student1= new Student( name:'Ash Price',
                    studentid:'B4035277',
                    email:'b4035277@my.shu.ac.uk',
                    username:'B4035277',
                    password:'Password1',
                    dob: new Date('16/07/1995'),
                    course:'Computing').save()

def student2= new Student(name:'Will Smith',
                    studentid:'B4035266',
                    email:'b4035266@my.shu.ac.uk',
                    username:'B4035266',
                    password:'Password2',
                    dob: new Date('10/05/1996'),
                    course:'Computing').save()

def student3= new Student( name:'Jamie Wilkinson',
                    studentid:'B4035255',
                    email:'b4035255@my.shu.ac.uk',
                    username:'B4035255',
                    password:'Password3',
                    dob: new Date('11/08/1992'),
                    course:'Computing').save()
}
    def destroy = {
    }
}
