import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StorageService {
  constructor() {
  }

  getItem(name: string): any {
    return sessionStorage.getItem(name);
  }

  setItem(name: string, input: any) {
    sessionStorage.setItem(name, input);
  }

  removeItem(name: string) {
    sessionStorage.removeItem(name);
  }

}
