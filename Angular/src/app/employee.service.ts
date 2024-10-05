import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseURL="http://localhost:8088/employee";
  constructor(private httpClient:HttpClient) {}

  getEmployeeList(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }
  
  createEmployee(employee: Employee): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, employee);
  }

  getEmployeeById(id:number):Observable<Employee>{
    return this.httpClient.get<Employee>(`${this.baseURL}/${id}`);
  }

  updateEmployee(id:number,employee:Employee):Observable<Employee>
  {
    return this.httpClient.put<Employee>(`${this.baseURL}/${id}`,employee);
  }

  deleteEmployeeById(id:number):Observable<object>
  {
    return this.httpClient.delete<Employee>(`${this.baseURL}/${id}`);
  }
}


