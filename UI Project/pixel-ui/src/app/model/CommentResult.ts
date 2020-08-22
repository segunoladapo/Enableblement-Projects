
import {Comment} from './Comment';
export class CommentResult {
  pageSize: number;
  totalPages: number;
  contents: Comment[];
  last: boolean;
}
