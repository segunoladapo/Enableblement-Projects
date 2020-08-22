
import {Post} from './Post';
export class PostResult {
  pageSize: number;
  totalPages: number;
  contents: Post[];
  last: boolean;
}
