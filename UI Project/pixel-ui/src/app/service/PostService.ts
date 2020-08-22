import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {CommentResult} from '../model/CommentResult';
import {environment} from '../../environments/environment';
import {PostResult} from '../model/PostResult';

@Injectable({
  providedIn: 'root'
})
export class PostService {
  constructor(private httpClient: HttpClient) {
  }

  getPosts(pageNumber: number): Observable<PostResult> {
    let headers = new HttpHeaders({'Content-Type': 'application/json', 'Access-Control-Allow-Origin': '*'});
    let options = {headers: headers, crossDomain: true, withCredentials: false};
    return this.httpClient.get<PostResult>(`${environment.postEndpoint}?currentPage=${pageNumber}&pageSize=5`, options);
  }

}
