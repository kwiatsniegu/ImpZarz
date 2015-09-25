public class AdminAccount {
	string log_name;
	string passwd;
	string email;
	
	int check_in_database (string log, string pass, string email){}
	
	void setLogin(string log) { this.log_name = log; }
    string getLogin() { return this.log_name; }

    void setPasword(string xyz) { this.passwd = xyz; }
    string getPassword() { return this.passwd; }
}
