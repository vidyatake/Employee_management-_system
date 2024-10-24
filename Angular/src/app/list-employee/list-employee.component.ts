import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router} from '@angular/router';


@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrl: './list-employee.component.css'
})
export class ListEmployeeComponent {

  employee: Employee[] = [];

  constructor(private employeeservice: EmployeeService,private router:Router) { }

  ngOnInit(): void {

    this.getEmployees();


  }

  private getEmployees() {
    this.employeeservice.getEmployeeList().subscribe(data=>{
      this.employee=data;
    })
  }

  updateEmployee(id:number)
  {
    this.router.navigate(['update-employee',id]);
    
  }
  viewEmployee(id:number)
  {
    this.router.navigate(['employee-details',id]);
  }

  deleteEmployee(id:number)
  {
    this.employeeservice.deleteEmployeeById(id).subscribe(data=>
    {
      console.log(data);
      this.getEmployees();
    }
    )
  }

}
