import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {PostResult} from '../model/PostResult';
import {environment} from '../../environments/environment';
import {CommentResult} from '../model/CommentResult';

@Injectable({
  providedIn: 'root'
})
export class CommentService {
  constructor(private httpClient: HttpClient) {
  }


  getComments(postId: number, pageNumber: number): Observable<CommentResult> {
    let headers = new HttpHeaders({'Content-Type': 'application/json', 'Access-Control-Allow-Origin': '*'});
    let options = {headers: headers, crossDomain: true, withCredentials: false};
    return this.httpClient.get<CommentResult>(this.formatString(environment.commentEndpoint, postId.toString(), pageNumber.toString()), options);
  }

  formatString(str: string, ...val: string[]) {
    for (let index = 0; index < val.length; index++) {
      str = str.replace(`{${index}}`, val[index]);
    }
    return str;
  }
}
